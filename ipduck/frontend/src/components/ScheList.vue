<template>
		<main-nav></main-nav>	
<br>
<div class="search_result">스케쥴 검색 결과
	<table align="center" class="board_list" style="margin: 50px;">
			<tr>
				<td>연예인</td><td><a href="./schedule_spec.html">스케쥴</a></td><td>날짜</td>
			</tr>
			<tr>
				<td>연예인</td><td><a href="./schedule_spec.html">스케쥴</a></td><td>날짜</td>
			</tr>
			<tr>
				<td>연예인</td><td><a href="./schedule_spec.html">스케쥴</a></td><td>날짜</td>
			</tr>

		</table>
		원하는 결과가 없으면...<br><br>
		<button style="width:200px;font-size: 20px;" v-on:click.prevent="goScheCrt">새 스케쥴 등록하기</button>
</div>

</template>

<script>
import MainNav from '@/components/MainNav'

export default {
  name: 'sche-list',
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
