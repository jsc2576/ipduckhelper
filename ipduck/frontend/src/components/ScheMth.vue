<template>
	<div>
		<main-nav></main-nav>	

<br>
	<pre class="search_main">
	<h1 class="search_main">스케쥴 상세 검색</h1>
		<form action="./schedule_result.html">
		연예인 <input type="text" class="search"><br>
		스케쥴명 <input type="text" class="search"><br>
		시작날짜 <input type="text" class="search"><br>
		종료날짜 <input type="text" class="search"><br>
		
		<input type="submit" class="submit_button" value="검색하기">
		
		</form>
	</pre>
	</div>
</template>

<script>
import MainNav from '@/components/MainNav'

export default {
  name: 'sche-mth',
  components: { MainNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    goScheCrt: function () {
      this.$router.push({ name: 'ScheCrt' })
    },
    doLike: function () {
      alert('좋아요를 누르셨습니다.')
      // this.$router.push({ name: 'MmMfy' })
    },
    dltMm: function () {
      alert('영상을 삭제하시겠습니까?')
      // this.$router.push({ name: 'MmMfy' })
    },
    addTag: function () {
      alert('태그를 추가하시겠습니까')
      // this.$router.push({ name: 'MmMfy' })
    },
    goMmMfy: function () {
      alert('영상게시물을 편집하시겠습니까')
      // this.$router.push({ name: 'MmMfy' })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
