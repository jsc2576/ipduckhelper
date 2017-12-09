<template>
	<div>
		<main-nav></main-nav>	
<br>
<article>
	<h2>게시글 제목 {{this.$route.params.no1}} {{this.$route.params.no2}}</h2>
	<span>조회수 00</span>
	&nbsp;
	<button class="article" onclick="location.href='./write_article.html'">수정</button>&nbsp;&nbsp;<button class="article">삭제</button>
	<div>
		<pre>
			The standard Lorem Ipsum passage, used since the 1500s

"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
Section 1.10.32 of "de Finibus Bonorum et Malorum", written by Cicero in 45 BC

"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?"
		</pre>
		<img src="/img/sample.jpg">
	</div>

	<button>추천하기</button>
</article>

<table class="comment_list">
	<tr>
		<td class="author">닉네임</td>
		<td>댓글내용</td>
		<td class="like"><button class="article">수정</button></td>
		<td class="like"><button class="article">삭제</button></td>
	</tr>
		<tr>
		<td class="author">닉네임</td>
		<td>댓글내용</td>
		<td class="like"><button class="article">수정</button></td>
		<td class="like"><button class="article">삭제</button></td>
	</tr>
		<tr>
		<td class="author">닉네임</td>
		<form>
		<td colspan="2"><input type="text" class="search" name=""></td>
		<td class="like"><button class="article">등록</button></td>
		</form>
	</tr>
</table>
</table>
</template>

<script>
import MainNav from '@/components/MainNav'

export default {
  name: 'post-dtl-no',
  props: ['no1', 'no2'],
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
