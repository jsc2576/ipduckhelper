<template>
	<div>
		<main-nav></main-nav>	
<br>
<!-- 검색 키워드 표시 -->
<div class="search_result">검색어 <h1 class="search_result">활발</h1>에 대한 결과
<!-- 검색된 연예인 -->
	<div class="title">
		연예인
	</div>
	<div class="content">
		<a class="click-able" v-on:click.prevent="starSearchResultDetail">
			<div v-for="star in star_list">
				<img style="height: 100px;" v-bind:src="star.file_nm">
				{{star.star_nm}}
				<br>
			</div>
		</a>
	</div>

<!-- 검색된 갤러리 -->
	<div class="title">
			<br><br>
		갤러리
	</div>
	<div class="content">
		검색된 내용입니다 / <a class="click-able" v-on:click.prevent="goPostListNo">OO 갤러리</a><br>
		검색된 내용입니다 / <a class="click-able" v-on:click.prevent="goPostListNo">OO 갤러리</a><br>
		검색된 내용입니다 / <a class="click-able" v-on:click.prevent="goPostListNo">OO 갤러리</a><br>
		검색된 내용입니다 / <a class="click-able" v-on:click.prevent="goPostListNo">OO 갤러리</a><br>

		<br><br><br>
		원하는 결과가 없으면...
		<button class="click-able" style="width:200px;font-size: 20px;" v-on:click.prevent="goStarCrt" >새 연예인 등록하기</button>
	</div>
</div>
</template>

<script>
import MainNav from '@/components/MainNav'
import axios from 'axios'

export default {
  name: 'star-srch-rst-list',
  components: { MainNav },
  data () {
    return {
      msg: '',
      star_list: []
    }
  },
  created: function () {
    this.getStar()
  },
  methods: {
    getStar: function () {
      let self = this
      axios.post('/srch/list/star/do.go', {
        star_nm: '',
        offset: 0
      })
      .then(function (response) {
        var starList = response.data
        self.star_list = []
        for (var i = 0; i < starList.length; i++) {
          starList[i].file_nm = starList[i].file_path + starList[i].file_nm
          self.star_list.push(starList[i])
        }
        // alert(JSON.stringify(response))
      })
      .catch(function (error) {
        console.log(JSON.stringify(error))
      })
    },
    starSearchResultDetail: function () {
      this.$router.push({ name: 'StarSrchRstDtl', params: { no: 1 } })
    },
    goStarCrt: function () {
      this.$router.push({ name: 'StarCrt' })
    },
    goPostListNo: function () {
      this.$router.push({ name: 'PostListlNo', params: { no: 1 } })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
