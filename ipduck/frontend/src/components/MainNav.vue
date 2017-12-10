<template>
<ul class="navbar">
	<li class="left"><a class="click-able" v-on:click.prevent="goMyInfo">Linkaden님, 안녕하세요!</a></li>	
	<li class="right"><a v-on:click.prevent="goRankList" class="right click-able">검색 순위</a></li> 
	<li class="right"><a v-on:click.prevent="goScheList" class="right click-able">스케쥴</a></li> 
	<li class="right"><a v-on:click.prevent="goPostList" class="right click-able">연예인 갤러리</a></li> 
	<li class="right"><a v-on:click.prevent="goStarSrchDtl"	class="right click-able" >연예인 찾기</a></li> 
	<li class="right"><a v-on:click.prevent="goMain"class="right click-able" >홈으로 이동</a></li> 
</ul>
</template>

<script>

export default {
  name: 'main-nav',
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    goMyInfo: function () {
      this.$router.push({ name: 'MyInfo' })
    },
    goMain: function () {
      this.$router.push({ name: 'Main' })
    },
    goStarSrchDtl: function () {
      this.$router.push({ name: 'StarSrchDtl' })
    },
    goPostList: function () {
      this.$router.push({ name: 'PostList' })
    },
    goScheList: function () {
      alert('go to 스케쥴')
      // this.$router.push({ name: 'PostList' })
    },
    goRankList: function () {
      alert('go to 순위')
      // this.$router.push({ name: 'PostList' })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
