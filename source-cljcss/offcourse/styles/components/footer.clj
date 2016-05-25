(ns offcourse.styles.components.footer
  (:refer-clojure :exclude [first last + - * /])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [units :as u :refer [vh percent]]
              [selectors :as s]]
            [offcourse.styles.vocabulary :as v]))

(defn footer [{:keys [templates colors units borders]}]
  [[v/footer (merge (:highlighted templates)
                    {:padding [[(:three units) 0]]
                     :background (:night colors)
                     :color (:day colors)
                      })
    [v/footer--container (merge (:row-component templates)
                                {:align-items :flex-start})]]
   [v/footer--textbar (merge (:textbar templates)
                             (:title templates)
                             {:flex-direction :row
                              :font-size       (:subtitle-font units)
                              :padding [[(:third units) (:half units)]]
                              :border [[:none :none (:default borders) :none]]
                              :margin-right (:full units)
                              :margin-bottom (:full units)
                              :background (:day colors)
                              :color (:night colors)
                              :cursor :pointer})
    [v/hovered (:highlighted borders)]]
   [v/footer--icon {:height (:full units)
                    :width  (:full units)
                    :margin-right (:full units)}]])