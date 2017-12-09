<template>
<ul class="navbar">
	<li class="left"><a v-on:click.prevent="goMyInfo">마이페이지</a></li>	
	<li class="right"><a href="search_rate.html" class="right">나의 연예인</a></li> 
	<li class="right"><a href="./schedule.html" class="right">좋아요 한 글</a></li> 
	<li class="right"><a href="./galary.html" class="right">게시글/댓글</a></li> 	
	<li class="right"><a href="./search_main.html" class="right">프로필 설정</a></li>
</ul>
</template>

<script>

export default {
  name: 'my-nav',
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    goMyInfo: function () {
      this.$router.push({ name: 'MyInfo' })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
