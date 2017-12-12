<template>
	<div>
		<main-nav></main-nav>	

<br>
	<div class="search_result" style="padding:100px;">
		영상 등록하기<br>
		<form action="./meme.html">
			<div class="star_result" style="width:300px; height: 300px;">
				<img src="/img/file.png" style="width: 200px; height:200px;"><br>
				<input type="file" value="파일을 업로드하세요">
			</div>
			<div class="content">
				연예인 이름 <input type="text" class="search" style="width:600px"> <br><br>
				태그 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type="text" class="search" style="width:600px"><br><br><br>
	
				<input type="submit" class="submit_button" value="등록하기">
			</div>
		</form>
	</div>
</div>
</template>

<script>
import MainNav from '@/components/MainNav'

export default {
  name: 'sche-crt',
  components: { MainNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
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
