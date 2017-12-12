<template>
	<div class="main">
		<p align = "right">	
			<button class="click-able" v-on:click.prevent="goLoginLogout">{{login_btn}}</button> 
		</p>
		
		<h1 class="menu">입덕 도우미</h1>
		
		<form action="/srch/list/star/do.go">
			<input v-model="tag_nm" type="text" class="search" placeholder="원하는 연예인의 컨셉, 이름, 노래, 분위기 등을 검색해 보세요!">
			<button class="search_submit click-able" v-on:click.prevent="starSrch">
		</form>
	
		<br>	
		<button class="click-able" v-on:click.prevent="goStarSrchDtl">연예인 찾기</button>
		<button class="click-able" v-on:click.prevent="goPostList">연예인 갤러리</button>
		<button class="click-able" v-on:click.prevent="goMmList">영상/짤 모음</button>
		<button class="click-able" v-on:click.prevent="goRankList">검색 순위</button>
	</div>
</template>

<script>
// session 사용법
// https://www.npmjs.com/package/vue-sessionstorage
import axios from 'axios'

export default {
  name: 'star-srch',
  data () {
    return {
      login_btn: (this.$session.exists()) ? '로그아웃' : '로그인'
    }
  },
  methods: {
    goLoginLogout: function () {
      let self = this
      if (!self.$session.exists()) {
        self.$router.push({ name: 'Login' })
      } else {
        axios.post('/logout/do', {})
        .then(function (response) {
          alert('로그아웃 되었습니다.')
          self.$session.destroy()
          self.$data.login_btn = '로그인'
          self.$router.push({ name: 'Main' })
        }).catch(function (error) {
          alert(JSON.stringify(error))
        })
      }
    },
    goStarSrchDtl: function () {
      this.$router.push({ name: 'StarSrchDtl' })
    },
    goPostList: function () {
      this.$router.push({ name: 'PostList' })
    },
    goMmList: function () {
      this.$router.push({ name: 'MmList' })
    },
    goRankSrch: function () {
      this.$router.push({ name: 'RankSrch' })
    },
    starSrch: function () {
      this.$router.push({ name: 'StarSrchRstList' })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
	form{ display: inline-flex; }
</style>
