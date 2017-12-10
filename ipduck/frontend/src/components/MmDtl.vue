<template>
	<div>
		<main-nav></main-nav>	
<br>
<article>
	<h2>영상 제목  {{this.$route.params.no}}</h2>
	<span>조회수 00</span>
	&nbsp;
	<button class="article" onclick="location.href='./write_article.html'">수정</button>&nbsp;&nbsp;<button class="article">삭제</button>
	<div>
		<img src="/img/sample.jpg"><br>

	</div>

</article>
	<div style="text-align: left; margin: 30px;">
		<span style="font-size: 30px; margin-left: 30px;">태그1, 태그2, 태그3, 태그4, 태그5</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<button>태그 추가하기</button>
	<button>좋아요</button>

	</div>
</template>

<script>
import MainNav from '@/components/MainNav'

export default {
  name: 'mm-dtl',
  components: { MainNav },
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
