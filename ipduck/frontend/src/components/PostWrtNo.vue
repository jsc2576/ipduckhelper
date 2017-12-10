<template>
	<div>
		<main-nav></main-nav>	
<br>

<article>
	<form>
	<h2>게시글 등록하기</h2>
	<br>
	<span style="margin-left: 10px; margin-right: 10px;">제목</span><input type="text" name="" class="write_title"><br>
	<div>
		<textarea class="article"></textarea>
	</div>
	<br>
	<div class="filebox">
		<label for="upload">파일 업로드</label>
		<input type="file" id="upload">
	</div>
	<div style="margin-left: 200px;">
	<button v-on:click.prevent="createPost">등록</button>
	&nbsp;
	<button v-on:click.prevent="goBack">취소</button>
	</div>
	</form>
</article>
</div>
</template>

<script>
import MainNav from '@/components/MainNav'

export default {
  name: 'post-write-no',
  props: ['no'],
  components: { MainNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    createPost: function () {
      console.log('write to the post')
    },
    goBack: function () {
      this.$router.push('./../')
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
