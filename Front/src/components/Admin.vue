<template>
    <div class="p-6 max-w-5xl mx-auto">
      <h1 class="text-3xl font-bold mb-4">Interface Admin - Writeups</h1>
  
      <div class="mb-4">
        <button @click="createNew" class="bg-green-600 text-white px-4 py-2 rounded-xl shadow hover:bg-green-700">
          ➕ Nouveau Writeup
        </button>
      </div>
  
      <div v-for="(w, index) in writeups" :key="index" class="bg-white border p-4 rounded-xl shadow mb-4">
        <h2 class="text-xl font-semibold">{{ w.title }}</h2>
        <p class="text-sm text-gray-500 mb-2">{{ w.date }}</p>
        <p class="mb-2">{{ w.summary }}</p>
  
        <div class="flex gap-2">
          <button @click="editWriteup(w)" class="bg-blue-500 text-white px-3 py-1 rounded hover:bg-blue-600">Modifier</button>
          <button @click="deleteWriteup(index)" class="bg-red-500 text-white px-3 py-1 rounded hover:bg-red-600">Supprimer</button>
        </div>
      </div>
    </div>
  </template>
  
  <script setup>
  import { ref } from 'vue'
  
  const writeups = ref([
    {
      title: 'RootMe - Web Server',
      date: '2024-12-01',
      summary: 'Exploit d’une faille LFI via logs Apache.'
    },
    {
      title: 'RootMe - App-Script',
      date: '2025-01-15',
      summary: 'Injection Bash sur une console simulée.'
    }
  ])
  
  const createNew = () => {
    alert('Fonction "Créer" à implémenter')
  }
  
  const editWriteup = (w) => {
    alert(`Édition du writeup : ${w.title}`)
  }
  
  const deleteWriteup = (index) => {
    if (confirm('Supprimer ce writeup ?')) {
      writeups.value.splice(index, 1)
    }
  }
  </script>
  