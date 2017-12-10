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
		<a v-on:click.prevent="starSearchResultDetail">
		<div class="srat_result" style="float:left">
			<img src="/img/profile_none.png"><br>
			연예인 이름
		</div></a>

		<a v-on:click.prevent="starSearchResultDetail">
		<div class="srat_result" style="float:left">
		<img src="/img/profile_none.png"><br>
			연예인 이름
		</div></a>

		<a v-on:click.prevent="starSearchResultDetail">
		<div class="srat_result" style="float:left">
		<img src="/img/profile_none.png"><br>
			연예인 이름
		</div></a>

		<a v-on:click.prevent="starSearchResultDetail">
		<div class="srat_result" style="float:left">
		<img src="/img/profile_none.png"><br>
			연예인 이름
		</div></a>
	</div>

<!-- 검색된 갤러리 -->
	<div class="title">
			<br><br>
		갤러리
	</div>
	<div class="content">
		검색된 내용입니다 / <a v-on:click.prevent="goPostListNo">OO 갤러리</a><br>
		검색된 내용입니다 / <a v-on:click.prevent="goPostListNo">OO 갤러리</a><br>
		검색된 내용입니다 / <a v-on:click.prevent="goPostListNo">OO 갤러리</a><br>
		검색된 내용입니다 / <a v-on:click.prevent="goPostListNo">OO 갤러리</a><br>

		<br><br><br>
		원하는 결과가 없으면...
		<button style="width:200px;font-size: 20px;" v-on:click.prevent="goStarCrt" >새 연예인 등록하기</button>
	</div>
</div>
</template>

<script>
import MainNav from '@/components/MainNav'

export default {
  name: 'star-srch-rst-list',
  components: { MainNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
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
