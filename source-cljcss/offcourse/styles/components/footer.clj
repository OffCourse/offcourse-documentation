(ns offcourse.styles.components.footer
  (:refer-clojure :exclude [first last + - * /])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [units :as u :refer [vh percent]]]
            [offcourse.styles.vocabulary :as v]))

(defn footer [{:keys [templates colors units borders]}]
  [[v/footer (merge (:highlighted templates)
                    {
                     :background (:night colors)
                     :color (:day colors)
                      })
    [v/footer--container (merge (:row-component templates)
                                {:align-items :flex-start
                                 :padding [[(:four units) 0 (:four units) (* (:atom units) 35)]]})]]
   [v/footer--textbar (merge (:textbar templates)
                             (:title templates)
                             {:flex-direction :row
                              :font-size       (:subtitle-font units)
                              :padding [[(:half units) (:full units)]]
                              :border-bottom (:default borders)
                              :margin-right (:full units)
                              :margin-bottom (:full units)
                              :background (:day colors)
                              :color (:night colors)})
    [v/hovered (:highlighted borders)]]
   [v/footer--icon {:height (:full units)
                    :width  (:full units)
                    :margin-right (:full units)}]])