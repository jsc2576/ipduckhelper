<template>

<div class="main">
	<h1 class="menu" style="margin-top: 100px">Sign up</h1>
	<form>
		이메일&nbsp;
		<input type="text" class="search" style="width: 300px" v-model="mem_id"><br><br>
		비밀번호&nbsp;
		<input type="password" class="search" style="width: 300px" v-model="mem_pwd1"><br><br>
		비밀번호 재입력&nbsp;
		<input type="password" class="search" style="width: 300px" v-model="mem_pwd2"><br><br>
		이름&nbsp;
		<input type="text" class="search" style="width: 300px" v-model="mem_nm"><br><br>
		닉네임&nbsp;
		<input type="text" class="search" style="width: 300px" v-model="mem_nick"><br><br><br>
		<button @click.prevent="mSubmit" class="submit_button" style="font-size: 20px; width:230px">회원가입</button>
	</form>
	<br>
</div>
</template>

<script>
import axios from 'axios'
import Router from 'vue-router'

export default {
  name: 'Signup',
  data () {
    return {
      mem_id: '',
      mem_pwd1: '',
      mem_pwd2: '',
      mem_nick: '',
      mem_nm: ''
    }
  },
  methods: {
    mSubmit: function () {
      alert(this.mem_id)
      if (this.mem_pwd1 !== this.mem_pwd2) {
        console.log('비밀번호 불일치')
        return
      }
      axios.post('/signup/do', {
        profile_img: '',
        mem_id: this.mem_id,
        mem_pwd: this.mem_pwd1,
        mem_nick: this.mem_nick,
        mem_nm: this.mem_nm
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
