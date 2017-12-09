<template>
	<div>
		<main-nav></main-nav>
		<br>
		<pre class="search_main">
		<h1 class="search_main">연예인 상세 검색</h1>
		<form>
이름 <input type="text" class="search" style="width:150px"/>  기획사 <input type="text" class="search" style="width:200px"/>  키 <input type="text" class="search" style="width:80px"/><br>
나이 <input type="text" class="search" style="width:70px"/> 몸무게 <input type="text" class="search" style="width:70px"/> 혈액형 <input type="text" class="search" style="width:70px"/> 그룹/솔로 <input type="text" class="search" style="width:70px"/><br>
데뷔날짜 <input type="text" class="search" style="width:250px"/> 생년월일 <input type="text" class="search" style="width:250px"/><br>
태그 <input type="text" class="search" style="width:600px"/>


<button v-on:click.prevent="searchDetail()" class="submit_button" >검색하기</button>
		
</form>
</pre>
	</div>
</template>

<script>
import MainNav from '@/components/MainNav'

export default {
  name: 'srch-dtl',
  components: { MainNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    searchDetail: function () {
      this.$router.push('/srch/rst/list/view')
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
