<template>
	<div class="main">
		<h1 class="menu" style="margin-top: 100px">Log-In</h1>
	<form>
		이메일&nbsp;
		<input v-model="mem_id" type="text" class="search" style="width: 300px"><br /><br />
		비밀번호&nbsp;
		<input v-model="mem_pwd" type="password" class="search" style="width: 300px"><br /><br />
		<input class="submit_button" value="이메일 아이디로 로그인" style="font-size: 20px; width:230px"
			@click.prevent="login" >
	</form>
	<br>
	또는<br><br>
	<img src="/img/login_fb.png" style="width:200px; height: 40px">
	<img src="/img/login_gg.png" style="width:200px; height: 40px">
	<img src="/img/login_nv.png" style="width:200px; height: 40px">
	<img src="/img/login_kk.png" style="width:200px; height: 40px"><br /><br /><br />
	
	<router-link to="/signup/view" tag="button" style="font-size: 20px; width:230px">입덕도우미 계정 만들기</router-link>
	<button style="font-size: 20px; width:230px">계정/비밀번호 분실</button><br>
	<button style="margin-top: 10px;font-size: 20px; width:230px" onclick="location.href='./index.html'">홈으로 이동</button>
	</div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'Srch',
  data () {
    return {
      mem_id: '',
      mem_pwd: '',
    }
  },
  methods: {
    login: function () {
      axios.post('/login/do', {
        mem_id: this.mem_id,
        mem_pwd: this.mem_pwd
      })
      .then(function (response) {
        alert(JSON.stringify(response) + '')
        // Router.push('/SignupDone/view')
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
