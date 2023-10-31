(ns foo.demo
  (:require ["react-dom" :as rdom]
            [helix.dom :as d]
            [helix.core :refer [$ defnc <>]]
            [foo.shared :refer [Table]]))

(defnc App []
  (<>
   (d/h1 "This is the app")
   ($ Table)))

(defn ^:export start
  []
  (rdom/render ($ App) (js/document.getElementById "app")))
