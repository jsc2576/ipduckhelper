<template>
	<div class="main">
		<h1 class="menu" style="margin-top: 100px">Log-In</h1>
	<form>
		이메일&nbsp;
		<input v-model="mem_id" type="text" class="search" style="width: 300px"><br /><br />
		비밀번호&nbsp;
		<input v-model="mem_pwd" type="password" class="search" style="width: 300px"><br /><br />
		<button class="submit_button click-able" style="font-size: 20px; width:230px" v-on:click.prevent="login">이메일 아이디로 로그인</button>
	</form>
	<br>
	또는<br><br>
	<img class="click-able" v-on:click.prevent="loginFb" src="/img/login_fb.png" style="width:200px; height: 40px"/>
	<img class="click-able" v-on:click.prevent="loginGg" src="/img/login_gg.png" style="width:200px; height: 40px"/>
	<img class="click-able" v-on:click.prevent="loginNv" src="/img/login_nv.png" style="width:200px; height: 40px"/>
	<img class="click-able" v-on:click.prevent="loginKk" src="/img/login_kk.png" style="width:200px; height: 40px"/>
	<br><br><br>
	<button v-on:click.prevent="goSignup" class="click-able" style="font-size: 20px; width:230px">입덕도우미 계정 만들기</button>
	<button v-on:click.prevent="goLostIdPw" class="click-able" style="font-size: 20px; width:230px">계정/비밀번호 분실</button><br>
	<button v-on:click.prevent="goStarSrch" class="click-able" style="margin-top: 10px;font-size: 20px; width:230px">홈으로 이동</button>
		
	</div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'login',
  data () {
    return {
      mem_id: '',
      mem_pwd: ''
    }
  },
  methods: {
    goSignup: function () {
      this.$router.push({ name: 'Signup' })
    },
    goLostIdPw: function () {
      alert(' 계정/비밀번호 찾기 페이지로 이동합니다.')
      // this.$router.push({ name: 'Signup' })
    },
    goStarSrch: function () {
      this.$router.push({ name: 'StarSrch' })
    },
    loginFb: function () {
      alert('페이스북 로그인을 시도합니다.')
    },
    loginGg: function () {
      alert('구글 로그인을 시도합니다.')
    },
    loginNv: function () {
      alert('네이버 로그인을 시도합니다.')
    },
    loginKk: function () {
      alert('카카오톡 로그인을 시도합니다.')
    },
    login: function () {
      axios.post('/login/do', {
        mem_id: this.mem_id,
        mem_pwd: this.mem_pwd
      })
      .then(function (response) {
        alert(JSON.stringify(response))
        // this.$router.push({ name: 'Main' })
      })
      .catch(function (error) {
        alert(JSON.stringify(error))
      })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
