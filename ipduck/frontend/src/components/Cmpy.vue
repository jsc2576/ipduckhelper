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
	 {{this.$route.params.no}}
		OOOOOOOOOOOO 엔터테인먼트<br><br>
		대표 : OOO<br><br>
		소속 연예인<br><br>
		<a href="./search_star_spec.html">OOO</a>
		<a href="./search_star_spec.html">OOO</a>
		<a href="./search_star_spec.html">OOO</a>
		<a href="./search_star_spec.html">OOO</a>
		<a href="./search_star_spec.html">OOO</a>
		<a href="./search_star_spec.html">OOO</a>
		<a href="./search_star_spec.html">OOO</a>
		<a href="./search_star_spec.html">OOO</a>
		<a href="./search_star_spec.html">OOO</a>
		<a href="./search_star_spec.html">OOO</a>
		<a href="./search_star_spec.html">OOO</a>
		<a href="./search_star_spec.html">OOO</a>
		<a href="./search_star_spec.html">OOO</a>
		<a href="./search_star_spec.html">OOO</a>
		<a href="./search_star_spec.html">OOO</a>
		<a href="./search_star_spec.html">OOO</a>
	</div>
</div>
</template>

<script>
import MainNav from '@/components/MainNav'
import axios from 'axios'

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
    crtGrp: function () {
      // let self = this
      axios.post('/crt/grp/do.admin', {
        cmpy_nm: this.cmpy_name,
        star_nm: this.grp_nm,
        upload_img: null,
        clb_site: ''
      })
      .then(function (response) {
        console.log(JSON.stringify(response))
      })
      .catch(function (error) {
        console.log(JSON.stringify(error))
      })
    },
    getGrpNms: function () {
      let self = this
      axios.post('/srch/names/grp/do.go', {})
      .then(function (response) {
        console.log(JSON.stringify(response))
        var grpNms = response.data
        self.grp_nms = []
        let els = self.$el.querySelectorAll('.del2')
        for (var j = 0; j < els.length; j++) {
          els[j].remove()
        }
        for (var i = 0; i < grpNms.length; i++) {
          self.grp_nms.push(grpNms[i])
        }
        console.log(JSON.stringify(self.grp_nms))
      })
      .catch(function (error) {
        console.log(JSON.stringify(error))
      })
    },
    getCmpyNms: function () {
      let self = this
      axios.post('/srch/names/cmpy/do', {})
      .then(function (response) {
        var cmpyNms = response.data
        self.cmpy_nms = []
        let els = self.$el.querySelectorAll('.del1')
        for (var j = 0; j < els.length; j++) {
          els[j].remove()
        }
        for (var i = 0; i < cmpyNms.length; i++) {
          self.cmpy_nms.push(cmpyNms[i])
        }
      })
      .catch(function (error) {
        console.log(JSON.stringify(error))
      })
    },
    starCreate: function () {
      // let self = this
      /* axios.post('/crt/star/do.admin', {
      })
      .then(function (response) {
      })
      .catch(function (error) {
      }) */
    },
    onFileChange: function (e) {
      let files = e.target.files || e.dataTransfer.files
      if (!files.length) {
        return
      }
      this.createImage(files[0])
    },
    createImage: function (file) {
      // /crt/star/do.admin
      // let image = new Image()
      let reader = new FileReader()
      let vm = this
      reader.onload = (e) => {
        vm.image = e.target.result
      }
      reader.readAsDataURL(file)
    },
    removeImage: function (e) {
      this.image = ''
      e.preventDefault()
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
