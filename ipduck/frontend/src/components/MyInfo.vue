<template>
	<div>
		<my-nav></my-nav>	
<br>
<div class="search_result" style="padding:40px;">
	회원 정보<br>
	<div class="star_result" style="width:300px; height: 300px;">
		<img src="/img/profile_none.png" style="width: 200px; height:200px;"><br>
	</div>
	<div class="content">
		아이디: abc@def.com<br><br>
		회원 등급: 정회원<br><br>
		이름 : 12312321<br><br>
		닉네임 : 12312321<br><br>
		<button class="click-able" v-on:click.prevent="modifyMyInfo">정보 수정하기</button>
	</div>
</div>
</template>

<script>
import MyNav from '@/components/MyNav'

export default {
  name: 'my-info',
  components: { MyNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    modifyMyInfo: function () {
      this.$router.push({ name: 'MyMfy' })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
