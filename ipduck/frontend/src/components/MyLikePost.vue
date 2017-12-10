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
				<td class="author">글쓴사람</td>
				<td class="date">20170101</td>
				<td class="visit">조회수 10</td>
				<td class="like">추천수 10</td>
			</tr>
			<tr>
				<td>123456</td>
				<td><a class="click-able" v-on:click.prevent="postDetailNo">연예인 사랑해요</a></td>
				<td>글쓴사람</td>
				<td>20170101</td>
				<td>조회수 10</td>
				<td>추천수 10</td>
			</tr>
			<tr>
				<td>123456</td>
				<td><a class="click-able" v-on:click.prevent="postDetailNo">연예인 사랑해요</a></td>
				<td>글쓴사람</td>
				<td>20170101</td>
				<td>조회수 10</td>
				<td>추천수 10</td>
			</tr>
			<tr>
				<td>123456</td>
				<td><a class="click-able" v-on:click.prevent="postDetailNo">연예인 사랑해요</a></td>
				<td>글쓴사람</td>
				<td>20170101</td>
				<td>조회수 10</td>
				<td>추천수 10</td>
			</tr>
		</table>
	</div>
	<div>
	영상/짤방
		<div style="margin-top: 30px; margin-bottom: 30px;">
			<div class="star_result" style="width:450px; height: 300px;">
				<a class="click-able" v-on:click.prevent="goMmDtl"><img src="/img/sample.jpg" style="width: 400px; height:200px;"></a><br>
				영상정보텍스트
			</div>
			<div class="star_result" style="width:450px; height: 300px;">
				<a class="click-able" v-on:click.prevent="goMmDtl"><img src="/img/sample.jpg" style="width: 400px; height:200px;"></a><br>
				영상정보텍스트
			</div>
			<div class="star_result" style="width:450px; height: 300px;">
				<a class="click-able" v-on:click.prevent="goMmDtl"><img src="/img/sample.jpg" style="width: 400px; height:200px;"></a><br>
				영상정보텍스트
			</div>
		</div>
	</div>
</div>
</template>

<script>
import MyNav from '@/components/MyNav'

export default {
  name: 'my-like-post',
  components: { MyNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    postDetailNo: function () {
      this.$router.push({ name: 'PostDtlNo', params: { no1: 1, no2: 7 } })
    },
    goMmDtl: function () {
      this.$router.push({ name: 'MmDtl', params: { no: 1 } })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
