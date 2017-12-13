<template>
<ul class="navbar">
	<li class="left"><a class="click-able" v-on:click.prevent="goMyInfo">{{ getIntro() }}</a></li>	
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
      // this.$session.get('usr').mem_id: ''
      mem_id: (this.$session.exists()) ? this.$session.get('usr').mem_id : '방문자'
    }
  },
  methods: {
    getIntro: function () {
      return this.$data.mem_id + '님, 안녕하세요!'
    },
    goMyInfo: function () {
      if (this.$session.exists()) {
        if (this.$session.get('usr').mem_stat === 2) {
          this.$router.push({ name: 'Admin' })
        } else {
          this.$router.push({ name: 'MyInfo' })
        }
      } else {
        this.$router.push({ name: 'Login' })
      }
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
      this.$router.push({ name: 'ScheTdy' })
    },
    goRankList: function () {
      // alert('go to 순위')
      this.$router.push({ name: 'RankSrch' })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
