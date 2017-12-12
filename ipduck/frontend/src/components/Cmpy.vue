<template>
	<div>
		<main-nav></main-nav>
		<br>
<div class="search_result" style="padding:40px;">
	기획사 정보<br>
	<div class="star_result" style="width:300px; height: 300px;">
		<img src="/img/profile_none.png" style="width: 200px; height:200px;"><br>
	</div>
	<div class="content">
		OOOOOOOOOOOO 엔터테인먼트<br><br>
		대표 : OOO<br><br>
		소속 연예인<br><br>
		<a class="click-able" v-on:click.prevent="starSearchResultDetail">OOO</a>
		<a class="click-able" v-on:click.prevent="starSearchResultDetail">OOO</a>
		<a class="click-able" v-on:click.prevent="starSearchResultDetail">OOO</a>
		<a class="click-able" v-on:click.prevent="starSearchResultDetail">OOO</a>
		<a class="click-able" v-on:click.prevent="starSearchResultDetail">OOO</a>
		<a class="click-able" v-on:click.prevent="starSearchResultDetail">OOO</a>
		<a class="click-able" v-on:click.prevent="starSearchResultDetail">OOO</a>
		<a class="click-able" v-on:click.prevent="starSearchResultDetail">OOO</a>
		<a class="click-able" v-on:click.prevent="starSearchResultDetail">OOO</a>
		<a class="click-able" v-on:click.prevent="starSearchResultDetail">OOO</a>
		<a class="click-able" v-on:click.prevent="starSearchResultDetail">OOO</a>
		<a class="click-able" v-on:click.prevent="starSearchResultDetail">OOO</a>
		<a class="click-able" v-on:click.prevent="starSearchResultDetail">OOO</a>
		<a class="click-able" v-on:click.prevent="starSearchResultDetail">OOO</a>
		<a class="click-able" v-on:click.prevent="starSearchResultDetail">OOO</a>
		<a class="click-able" v-on:click.prevent="starSearchResultDetail">OOO</a>
	</div>
</div>
</template>

<script>
import MainNav from '@/components/MainNav'
// import axios from 'axios'

export default {
  name: 'cmpy',
  components: { MainNav },
  data () {
    return {
      msg: ''
    }
  },
  watch: {
  },
  methods: {
    starSearchResultDetail: function () {
      this.$router.push({ name: 'StarSrchRstDtl', params: { no: 1 } })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#app{
text-align: unset !important;
}
</style>
