<template>
	<div class="main">
		<p align = "right">	
			<router-link v-bind:to="{ name:'Login' }" tag="button">login</button> 
		</p>
		
		<h1 class="menu">입덕 도우미</h1>
		
		<form action="/srch/list/star/do.go">
			<input v-model="tag_nm" type="text" class="search" placeholder="원하는 연예인의 컨셉, 이름, 노래, 분위기 등을 검색해 보세요!">
			<button class="search_submit" v-on:click.prevent="starSrch">
		</form>
	
		<br>	
		<button v-on:click.prevent="goStarSrchDtl">연예인 찾기</button>
		<button v-on:click.prevent="goPostList">연예인 갤러리</button>
		<button v-on:click.prevent="goMmList">상/짤 모음</button>
		<button v-on:click.prevent="goRankList">검색 순위</button>
	</div>
</template>

<script>
// import axios from 'axios'

export default {
  name: 'star-srch',
  data () {
    return {
      tag_nm: ''
    }
  },
  methods: {
    goStarSrchDtl: function () {
      this.$router.push({ name: 'StarSrchDtl' })
    },
    goPostList: function () {
      this.$router.push({ name: 'PostList' })
    },
    goMmList: function () {
      this.$router.push({ name: 'MmList' })
    },
    goRankList: function () {
      alert('go to 순위')
      // this.$router.push({ name: 'PostList' })
    },
    starSrch: function () {
      this.$router.push({ name: 'StarSrchRstList' })
      /* axios.post('/star/srch/list/star/do.go', {
        tag_nm: this.tag_nm
      })
      .then(function (response) {
        console.log(response)
      })
      .catch(function (error) {
        console.log(error)
      }) */
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
	form{ display: inline-flex; }
</style>
