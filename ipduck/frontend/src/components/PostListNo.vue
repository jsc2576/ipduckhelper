<template>
	<div>
		<main-nav></main-nav>	

<br>

<h1 class="galary">OOO 갤러리 {{this.$route.params.no}}</h1>
<button style="margin-right: 200px" v-on:click.prevent="postWrite">글쓰기</button>
<form style="display: inline-block;">
	<input type="text" class="search" style="width: 300px; margin-left: 100px;" placeholder="갤러리 내 게시글/댓글 검색">
	<button v-on:click.prevent="searchPostDtl" class="search_submit"></button>
</form>
<br><br><br><br>
<table align="center" class="board_list">
	<tr>
		<th class="no">게시글번호</th>
		<th>제목</th>
		<th class="author">글쓴이</th>
		<th class="date">게시날짜</th>
		<th class="visit">조회수</th>
		<th class="like">추천수</th>
	</tr>
	<tr>
		<td>123456</td>
		<td><a v-on:click.prevent="postDetailNo">연예인 사랑해요</a></td>
		<td>OOO</td>
		<td>20170101</td>
		<td>10</td>
		<td>10</td>
	</tr>
		<tr>
		<td>123456</td>
		<td><a v-on:click.prevent="postDetailNo">연예인 사랑해요</a></td>
		<td>OOO</td>
		<td>20170101</td>
		<td>10</td>
		<td>10</td>
	</tr>
		<tr>
		<td>123456</td>
		<td><a v-on:click.prevent="postDetailNo">연예인 사랑해요</a></td>
		<td>OOO</td>
		<td>20170101</td>
		<td>10</td>
		<td>10</td>
	</tr>
		<tr>
		<td>123456</td>
		<td><a v-on:click.prevent="postDetailNo">연예인 사랑해요</a></td>
		<td>OOO</td>
		<td>20170101</td>
		<td>10</td>
		<td>10</td>
	</tr>
		<tr>
		<td>123456</td>
		<td><a v-on:click.prevent="postDetailNo">연예인 사랑해요</a></td>
		<td>OOO</td>
		<td>20170101</td>
		<td>10</td>
		<td>10</td>
	</tr>
		<tr>
		<td>123456</td>
		<td><a v-on:click.prevent="postDetailNo">연예인 사랑해요</a></td>
		<td>OOO</td>
		<td>20170101</td>
		<td>10</td>
		<td>10</td>
	</tr>
		<tr>
		<td>123456</td>
		<td><a v-on:click.prevent="postDetailNo">연예인 사랑해요</a></td>
		<td>OOO</td>
		<td>20170101</td>
		<td>10</td>
		<td>10</td>
	</tr>
		<tr>
		<td>123456</td>
		<td><a v-on:click.prevent="postDetailNo">연예인 사랑해요</a></td>
		<td>OOO</td>
		<td>20170101</td>
		<td>10</td>
		<td>10</td>
	</tr>
</table>
</template>

<script>
import MainNav from '@/components/MainNav'

export default {
  name: 'post-list-no',
  props: ['no'],
  components: { MainNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    postDetailNo: function () {
      this.$router.push({ name: 'PostDtlNo', params: { no1: 1, no2: 7 } })
    },
    postWrite: function () {
      this.$router.push({ name: 'PostWrtNo', params: { no: this.$route.params.no } })
    },
    searchPostDtl: function () {
      console.log('search to post detail')
      // this.$router.push({ name: 'PostWrtNo', params: { no: this.$route.params.no } })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
