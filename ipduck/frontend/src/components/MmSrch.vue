<template>
	<div>
		<main-nav></main-nav>	
	
<br>
<pre class="search_main">
<h1 class="search_main">영상 상세 검색</h1>
<form>
연예인 이름 <input type="text" class="search" style="width:150px">&nbsp;&nbsp;&nbsp;추천수 <input type="text" class="search" style="width:200px"><br>
게시자 <input type="text" class="search" style="width:150px">&nbsp;&nbsp;&nbsp;조회수 <input type="text" class="search" style="width:70px"><br>
태그 <input type="text" class="search" style="width:600px">


<button v-on:click.prevent="goMmList">검색하기</button>

</form>
</pre>

</template>

<script>
import MainNav from '@/components/MainNav'

export default {
  name: 'mm-srch',
  components: { MainNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    goMmList: function () {
      this.$router.push({ name: 'MmList' })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
