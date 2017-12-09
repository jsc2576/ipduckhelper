<template>
	<br>
<div class="search_result" style="padding:40px;">
	연예인 등록하기<br>
	<form action="./search_star_spec.html">
		<div class="star_result" style="width:300px; height: 300px;">
			<img src="./css/img/profile_none.png" style="width: 200px; height:200px;"><br>
			<input type="file" value="사진을 업로드하세요">
		</div>
		<div class="content">
			이름 <input type="text" class="search" style="width:150px"> &nbsp;
			기획사 <input type="text" class="search" style="width:200px"> &nbsp;
			키 <input type="text" class="search" style="width:80px"><br><br>
			나이 <input type="text" class="search" style="width:70px"> &nbsp;
			몸무게 <input type="text" class="search" style="width:70px"> &nbsp;
			혈액형 <input type="text" class="search" style="width:70px"> &nbsp;
			그룹/솔로 <input type="text" class="search" style="width:70px"><br><br>
			데뷔날짜 <input type="text" class="search" style="width:250px"> &nbsp;
			생년월일 <input type="text" class="search" style="width:250px"><br><br>
			태그 <input type="text" class="search" style="width:600px"><br><br>

			<input v-on:click.prevent="starCreate" class="submit_button" value="등록하기">
		</div>
	</form>
	</div>
</div>
</template>

<script>
import MainNav from '@/components/MainNav'

export default {
  name: 'star-crt',
  components: { MainNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    starCreate: function () {
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
