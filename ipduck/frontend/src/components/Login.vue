<template>
	<div class="main">
		<h1 class="menu" style="margin-top: 100px">Log-In</h1>
	<form>
		이메일&nbsp;
		<input v-model="mem_id" type="text" class="search" style="width: 300px"><br /><br />
		비밀번호&nbsp;
		<input v-model="mem_pwd" type="password" class="search" style="width: 300px"><br /><br />
		<button class="submit_button" style="font-size: 20px; width:230px" @click.prevent="login">이메일 아이디로 로그인</button>
	</form>
	<br>
	또는<br><br>
	<router-link tag="img" src="/img/login_fb.png" style="width:200px; height: 40px"></router-link>
	<router-link tag="img" src="/img/login_gg.png" style="width:200px; height: 40px"></router-link>
	<router-link tag="img" src="/img/login_nv.png" style="width:200px; height: 40px"></router-link>
	<router-link tag="img" src="/img/login_kk.png" style="width:200px; height: 40px"></router-link>
	
	<router-link to="/signup/view" tag="button" style="font-size: 20px; width:230px">입덕도우미 계정 만들기</router-link>
	<button style="font-size: 20px; width:230px">계정/비밀번호 분실</button><br>
	<router-link to="Srch" tag="button" style="margin-top: 10px;font-size: 20px; width:230px" >홈으로 이동</router-link>
		
	</div>
</template>

<script>
import axios from 'axios'
import Router from 'vue-router'

export default {
  name: 'ogin',
  data () {
    return {
      mem_id: '',
      mem_pwd: ''
    }
  },
  methods: {
    login: function () {
      axios.post('/login/do', {
        mem_id: this.mem_id,
        mem_pwd: this.mem_pwd
      })
      .then(function (response) {
        Router.push({ name: 'Main' })
      })
      .catch(function (error) {
        console.log(error)
      })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
