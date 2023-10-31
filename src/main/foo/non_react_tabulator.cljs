(ns foo.non-react-tabulator
  (:require ["tabulator-tables" :as TabulatorFull]
            [helix.core :refer [$ defnc]]
            [helix.dom :as d]
            [helix.hooks :as hooks]))

(defnc Tabulator
  [{:keys [ data columns options]}]
  (let [ref (hooks/use-ref nil)
        table (hooks/use-ref nil)]
    (hooks/use-effect
     [data columns]
     (reset! table (TabulatorFull. @ref (clj->js {:selectable false
                                                  :layout "fitColumns"
                                                  :columns columns
                                                  :data data}))))
    (d/div {:className "mt-3" :ref #(reset! ref %)})))
