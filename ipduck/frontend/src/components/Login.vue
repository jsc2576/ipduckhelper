<template>
	<div class="main">
		<h1 class="menu" style="margin-top: 100px">Log-In</h1>
	<form>
		이메일&nbsp;
		<input type="text" class="search" style="width: 300px"><br><br>
		비밀번호&nbsp;
		<input type="password" class="search" style="width: 300px"><br><br>
		<input type="submit" class="submit_button" value="이메일 아이디로 로그인" style="font-size: 20px; width:230px">
	</form>
	<br>
	또는<br><br>
	<img src="/css/img/login_fb.png" style="width:200px; height: 40px">
	<img src="/css/img/login_gg.png" style="width:200px; height: 40px">
	<img src="/css/img/login_nv.png" style="width:200px; height: 40px">
	<img src="/css/img/login_kk.png" style="width:200px; height: 40px"><br><br><br>
	<button style="font-size: 20px; width:230px" onclick="location.href='./sign_up.html'">입덕도우미 계정 만들기</button>
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
      msg: 'Welcome to Your Vue.js '
    }
  },
  methods: {
    srch: function () {
      axios({
        method: 'POST',
        url: '/srch/list/star/do.go'
      })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
	form{ display: inline-flex; }
</style>
