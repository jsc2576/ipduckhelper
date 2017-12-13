<template>
	<div>
		<main-nav></main-nav>
		<br>
		<div class="search_result" style="padding:40px;">
			<h1>관리자 페이지<h1>
			 <div v-for="usr in usr_list">
			    <h1>{{usr.mem_nm}}</h1> <button v-on:click.prevent="admit"> 승인 </button>
			 </div>
		<div class="content">
		</div>
	</div>
</template>

<script>
import MainNav from '@/components/MainNav'
import axios from 'axios'

export default {
  name: 'star-crt',
  components: { MainNav },
  data () {
    return {
      usr_list: [],
      image: '',
      cmpy_nms: [],
      cmpy_nm: '',
      grp_nm: '',
      grp_nms: [],
      grp_idx: 0,
      star_mem_hght: 0,
      star_mem_wght: 0,
      star_mem_bld: '',
      star_mem_birth: '',
      star_dbt_date: '',
      upload_img: null
      // /img/profile_none.png
    }
  },
  watch: {
    getUser: function () {
      let self = this
      axios.post('/srch/list/mem/do.admin', {
        offset: 0,
        mem_id: ''
      })
      .then(function (response) {
        let usrList = response.data
        for (var j = 0; j < usrList.length; j++) {
          self.usr_list.push(usrList[j])
        }
      })
      .catch(function (error) {
        console.log(JSON.stringify(error))
      })
      if (this.$data.grp_idx === '1') {
        this.$el.querySelector('#grp_nm').style.display = 'inline'
      } else {
        this.$el.querySelector('#grp_nm').style.display = 'none'
      }
    }
  },
  methods: {
    crtGrp: function () {
      // let self = this
      axios.post('/crt/grp/do.admin', {
        cmpy_nm: this.cmpy_nm,
        star_nm: this.grp_nm,
        upload_img: null,
        clb_site: ''
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
      let form = new FormData()
      let self = this
      form.append('star_nm', self.star_nm)
      form.append('upload_img', document.getElementById('file').files[0])
      form.append('star_dbt_date', self.star_dbt_date)
      form.append('cmpy_nm', self.cmpy_nm)
      form.append('grp_idx', self.grp_idx)
      form.append('star_mem_bld', self.star_mem_bld)
      form.append('star_mem_wght', self.star_mem_wght)
      form.append('star_mem_hght', self.star_mem_hght)
      form.append('star_mem_birth', self.star_mem_birth)
      window.sendPost('/crt/star/do.admin', form)
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
