<template>
	<div>
		<my-nav></my-nav>	
<br>
<div class="search_result" style="padding:40px;">
	게시글<br>
	<div>
		<table align="center" class="board_list" style="margin-top: 30px; margin-bottom: 30px;">
			<tr>
				<td class="no">글번호</td>
				<td><a>쓴 글 제목</a></td>
				<td class="author">글쓴위치</td>
				<td class="date">20170101</td>
				<td class="visit">조회수 10</td>
				<td class="like">추천수 10</td>
			</tr>
			<tr>
				<td>123456</td>
				<td><a v-on:click.prevent="postDetailNo">연예인 사랑해요</a></td>
				<td>OOO 갤러리</td>
				<td>20170101</td>
				<td>조회수 10</td>
				<td>추천수 10</td>
			</tr>
			<tr>
				<td>123456</td>
				<td><a v-on:click.prevent="postDetailNo">연예인 사랑해요</a></td>
				<td>OOO 갤러리</td>
				<td>20170101</td>
				<td>조회수 10</td>
				<td>추천수 10</td>
			</tr>
			<tr>
				<td>123456</td>
				<td><a v-on:click.prevent="postDetailNo">연예인 사랑해요</a></td>
				<td>글쓴위치</td>
				<td>20170101</td>
				<td>조회수 10</td>
				<td>추천수 10</td>
			</tr>
		</table>
	</div>
	<div>
	댓글
		<table align="center" class="board_list" style="margin-top: 30px;">
			<tr>
				<td><a v-on:click.prevent="postDetailNo">댓글이달린글</a></td>
				<td class="title">댓글내용</td>
				<td class="date">20171209</td>
			</tr>
			<tr>
				<td><a v-on:click.prevent="postDetailNo">댓글이달린글</a></td>
				<td>댓글내용</td>
				<td>20171209</td>
			</tr>
			<tr>
				<td><a v-on:click.prevent="postDetailNo">댓글이달린글</a></td>
				<td>댓글내용</td>
				<td>20171209</td>
			</tr>						
		</table>
	</div>
</div>
</template>

<script>
import MyNav from '@/components/MyNav'

export default {
  name: 'my-post-list',
  components: { MyNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    postDetailNo: function () {
      this.$router.push({ name: 'PostDtlNo', params: { no1: 1, no2: 7 } })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
