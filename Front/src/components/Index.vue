<template>
    <div class="container">
      <h1>Bienvenue sur mon site !</h1>
      <p class="intro">Je suis un passionné de cybersécurité et de développement.</p>
      <p class="section-title">💻 Voici quelques-unes de mes compétences :</p>
      <ul class="skills">
        <li>🔐 Cybersécurité</li>
        <li>🌐 Développement Web</li>
        <li>📊 Analyse de données</li>
      </ul>
      <p class="section-title">📬 J'ai créé un petit site pour que vous appreniez à me connaitre</p>
      <Contact />
    </div>
  </template>
  
  <script setup>
  // rien à modifier ici
  </script>
  
  <style scoped>
  .container {
    background-color: #000;
    color: #00ff00;
    align-items: center ;
    padding: 2rem;
    border-radius: 20px;
    text-align: center;
    text-justify: auto;
    font-family: 'Courier New', Courier, monospace;
    box-shadow: 0 0 20px rgba(0, 255, 0, 0.2);
    max-width: 80vw;
    max-height: 80vh;
    overflow: auto;
    margin:auto;
    line-height: 1.6;
  }
  
  h1 {
    font-size: 2rem;
    margin-bottom: 1rem;
    text-shadow: 0 0 5px limegreen;
  }
  
  .intro {
    font-size: 1.1rem;
    margin-bottom: 1rem;
  }
  
  .section-title {
    font-weight: bold;
    margin-top: 1.5rem;
  }
  
  .skills {
    list-style: none;
    padding: 0;
    margin-left: 1rem;
  }
  
  .skills li {
    margin-bottom: 0.5rem;
  }
  </style>