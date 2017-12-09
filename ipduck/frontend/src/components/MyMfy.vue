<template>
	<div>
		<my-nav></my-nav>	
<br>
<div class="search_result" style="padding:40px;">
	<form>
	회원 정보<br>
	<div class="star_result" style="width:300px; height: 300px;">
		<img src="/img/profile_none.png" style="width: 200px; height:200px;"><br>
		<input type="file">
	</div>
	<div class="content">
		
		아이디: abc@def.com<br><br>
		회원 등급: 정회원<br><br>
		이름 : <input type="text" class="write_info"><br><br>
		닉네임 : <input type="text" class="write_info"><br><br>
		<button onclick="location.href='./profile_main_approved.html'">정보 수정하기</button>
		
	</div>
	</form>
</div>
</template>

<script>
import MyNav from '@/components/MyNav'

export default {
  name: 'my-mfy',
  components: { MyNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
