<template>
    <div>
      <h1>Writeups RootMe</h1>
      <ul>
        <li v-for="w in writeups" :key="w.id">
          {{ w.title }} - <router-link :to="`/blog/${w.slug}`">Voir</router-link>
        </li>
      </ul>
    </div>
  </template>
  
  <script setup>
  import { ref, onMounted } from 'vue'
  import axios from 'axios'
  
  const writeups = ref([])
  
  onMounted(async () => {
    const res = await axios.get('http://localhost:8080/api/writeups')
    writeups.value = res.data
  })
  </script>
  