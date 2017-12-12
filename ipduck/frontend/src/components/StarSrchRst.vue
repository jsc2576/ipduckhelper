<template>
	<div>
		<main-nav></main-nav>
<br>
<div class="search_result" style="padding:40px;">
	조건과 일치하는 상세검색 결과<br><br>
	원하는 결과가 없으면...
		<button class="click-able" style="width:200px;font-size: 20px;" v-on:click.prevent="goStarCrt" >새 연예인 등록하기</button>
	<div class="star_result" style="width:300px; height: 300px; display: block;">
		<a href="./search_star_spec.html">
			<img src="/img/profile_none.png" style="width: 200px; height:200px; margin-top: 30px;"><br>
			<span>이름(그룹명)</span>
		</a>
	</div>
	<div class="star_result" style="width:300px; height: 300px; display: block;">
		<a href="./search_star_spec.html">
			<img src="/img/profile_none.png" style="width: 200px; height:200px; margin-top: 30px;"><br>
			<span>이름(그룹명)</span>
		</a>
	</div>
	<div class="star_result" style="width:300px; height: 300px; display: block;">
		<a href="./search_star_spec.html">
			<img src="/img/profile_none.png" style="width: 200px; height:200px; margin-top: 30px;"><br>
			<span>이름(그룹명)</span>
		</a>
	</div>
	<div class="star_result" style="width:300px; height: 300px; display: block;">
		<a href="./search_star_spec.html">
			<img src="/img/profile_none.png" style="width: 200px; height:200px; margin-top: 30px;"><br>
			<span>이름(그룹명)</span>
		</a>
	</div>
	<div class="star_result" style="width:300px; height: 300px; display: block;">
		<a href="./search_star_spec.html">
			<img src="/img/profile_none.png" style="width: 200px; height:200px; margin-top: 30px;"><br>
			<span>이름(그룹명)</span>
		</a>
	</div>
	<div class="star_result" style="width:300px; height: 300px; display: block;">
		<a href="./search_star_spec.html">
			<img src="/img/profile_none.png" style="width: 200px; height:200px; margin-top: 30px;"><br>
			<span>이름(그룹명)</span>
		</a>
	</div>
	<div class="star_result" style="width:300px; height: 300px; display: block;">
		<a href="./search_star_spec.html">
			<img src="/img/profile_none.png" style="width: 200px; height:200px; margin-top: 30px;"><br>
			<span>이름(그룹명)</span>
		</a>
	</div>
	<div class="star_result" style="width:300px; height: 300px; display: block;">
		<a href="./search_star_spec.html">
			<img src="/img/profile_none.png" style="width: 200px; height:200px; margin-top: 30px;"><br>
			<span>이름(그룹명)</span>
		</a>
	</div>
	<div class="star_result" style="width:300px; height: 300px; display: block;">
		<a href="./search_star_spec.html">
			<img src="/img/profile_none.png" style="width: 200px; height:200px; margin-top: 30px;"><br>
			<span>이름(그룹명)</span>
		</a>
	</div>


</div>
</template>

<script>
import MainNav from '@/components/MainNav'

export default {
  name: 'star-srch-rst',
  components: { MainNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    goStarCrt: function () {
      this.$router.push({ name: 'StarCrt' })
    },
    starSearchDetail: function () {
      this.$router.push('/star/srch/rst/list/view')
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
