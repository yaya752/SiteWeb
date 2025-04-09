<template>
    <div>
      <h2>Contacte-moi</h2>
      <form @submit.prevent="send">
        <input v-model="form.name" placeholder="Nom" required />
        <input v-model="form.email" placeholder="Email" required />
        <textarea v-model="form.message" placeholder="Ton message..." required></textarea>
        <button type="submit">Envoyer</button>
      </form>
      <p v-if="done">Message envoyé !</p>
    </div>
  </template>
  
  <script setup>
  import { ref } from 'vue'
  import axios from 'axios'
  
  const form = ref({ name: '', email: '', message: '' })
  const done = ref(false)
  
  async function send() {
    await axios.post('http://localhost:8080/api/contact', form.value)
    done.value = true
    form.value = { name: '', email: '', message: '' }
  }
  </script>
  
  <style scoped>
  form {
    display: flex;
    flex-direction: column;
    gap: 0.5rem;
  }
  input, textarea {
    padding: 0.5rem;
    width: 100%;
  }
  button {
    padding: 0.5rem;
  }
  </style>
  