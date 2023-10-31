(ns foo.demo
  (:require ["react-dom" :as rdom]
            [helix.dom :as d]
            [helix.core :refer [$ defnc]]))

(defnc App []
  (d/p "this is the app"))

(defn ^:export start
  []
  (rdom/render ($ App) (js/document.getElementById "app")))
