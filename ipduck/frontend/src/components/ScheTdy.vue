<template>
	<div>
		<main-nav></main-nav>	

<br>
<article>
	<h2>오늘의 스케쥴</h2>
	<button class="click-able" v-on:click.prevent="goScheCrt">새 스케쥴 등록</button>
	<div>
		<table align="center" class="board_list">
			<tr>
				<td>연예인</td><td><a href="./schedule_spec.html">스케쥴</a></td><td>날짜</td>
			</tr>
			<tr>
				<td>연예인</td><td><a href="./schedule_spec.html">스케쥴</a></td><td>날짜</td>
			</tr>
			<tr>
				<td>연예인</td><td><a href="./schedule_spec.html">스케쥴</a></td><td>날짜</td>
			</tr>
			<tr>
				<td>연예인</td><td><a href="./schedule_spec.html">스케쥴</a></td><td>날짜</td>
			</tr>
			<tr>
				<td>연예인</td><td><a href="./schedule_spec.html">스케쥴</a></td><td>날짜</td>
			</tr>
			<tr>
				<td>연예인</td><td><a href="./schedule_spec.html">스케쥴</a></td><td>날짜</td>
			</tr>
			<tr>
				<td>연예인</td><td><a href="./schedule_spec.html">스케쥴</a></td><td>날짜</td>
			</tr>
			<tr>
				<td>연예인</td><td><a href="./schedule_spec.html">스케쥴</a></td><td>날짜</td>
			</tr>
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
	</div>
	<br>
	<button class="click-able" style="width: 200px;" v-on:click.prevent="goScheMth">다른 스케쥴 조회</button>
</article>
</div>
</template>

<script>
import MainNav from '@/components/MainNav'

export default {
  name: 'sche-tdy',
  components: { MainNav },
  data () {
    return {
      msg: ''
    }
  },
  methods: {
    goScheMth: function () {
      this.$router.push({ name: 'ScheMth' })
    },
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
