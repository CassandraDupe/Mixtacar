import { createRouter, createWebHistory } from "vue-router";
import personnes_sur_le_trottoir from "../views/personnesSurLeTrottoirView.vue";
import vosTrajets from "../views/vosTrajetsView.vue";
import messages from "../views/messagesView.vue";
import profil from "../views/profilView.vue";
import deconnexion from "../views/deconnexionView.vue";
import proposerTrajetLieuxDepArView from "../views/proposerTrajetLieuxDepArView.vue";
import proposerTrajetItineraireView from "../views/proposerTrajetItineraireView.vue";
import proposerTrajetDateHeureView from "../views/proposerTrajetDateHeureView.vue";
import proposerTrajetNbPlaceResDir from "../views/proposerTrajetNbPlaceResDirView.vue";


// === définition des routes de l'application
// --- principalement les items du menu
// --- mais aussi des navigations internes comme 'master/detail'

// !!! important : la navigation doit se faire entre des "views" qui ne gèrent que l'affichage
// !!!  le code fonctionnel doit être uniquement dans les 'components'
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "home",
      component: () => import('../views/homeView.vue')
    },
    {
      path: "/vosTrajets",
      name: "Vos trajets",
      component: () => import('../views/vosTrajetsView.vue')
    },
    {
      path: "/messages",
      name: "messages",
      component: () => import('../views/messagesView.vue')
    },
    {
      path: "/profil",
      name: "profil",
      component: () => import('../views/profilView.vue')
    },
    {
      path: "/personnesSurLeTrottoirView",
      name: "personnes sur le trottoir",
      component: () => import('../views/personnesSurLeTrottoirView.vue')
    },
    {
      path: "/deconnexion",
      name: "deconnexion",
      component: () => import('../views/deconnexionView.vue')
    },
    {
      path: "/proposerTrajetLieuxDepAr",
      name: "Proposer trajet - Lieux départ et arrivée",
      component: () => import('../views/proposerTrajetLieuxDepArView.vue')
    },
    {
      path: "/proposerTrajetItineraire",
      name: "Proposer trajet - Itinéraire",
      component: () => import('../views/proposerTrajetItineraireView.vue')
    },
    {
      path: "/proposerTrajetDateHeure",
      name: "Proposer trajet - Date et Heure",
      component: () => import('../views/proposerTrajetDateHeureView.vue')
    },
    {
      path: "/proposerTrajetNbPlaceResDir",
      name: "Proposer un Trajet - Nombre de Places et Reservation Directe",
      component: () => import('../views/proposerTrajetNbPlaceResDirView.vue')
    },
    {
      path: "/proposerTrajetRetour",
      name: "Proposer un Trajet -Retour",
      component: () => import('../views/proposerTrajetRetourView.vue')
    }
  ]
});

export default router;
