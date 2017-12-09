<template>
<div class="main">
	<h1 class="menu" style="font-size: 50px">회원가입이 완료되었습니다.</h1>
	<br>
	로그인하시고, 입덕도우미의 서비스를 이용해 주세요!<br><br><br>
	<router-link v-bind:to="{ name:'Login' }" tag="button">로그인</router-link>
</div>
</template>

<script>

export default {
  name: 'signup-done',
  data () {
    return {
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
