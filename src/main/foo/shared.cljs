(ns foo.shared
  (:require ["react-tabulator" :refer [ReactTabulator]]
            [foo.non-react-tabulator :refer [Tabulator]]
            [helix.dom :as d]
            [helix.core :refer [$ defnc <>]]))

(def data [{:foo "foo 1" :bar "bar 1"}
           {:foo "foo 2" :bar "bar 2"}])

(def columns [{:title "foo" :field "foo"}
              {:title "bar" :field "bar"}])

(defnc Table
  []
  (<>
   (d/h2 "Table")
   #_($ Tabulator {:columns columns
                 :data data})
   ($ ReactTabulator {:columns (clj->js columns)
                      :data (clj->js data)})))
