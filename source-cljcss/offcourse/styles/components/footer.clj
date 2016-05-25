(ns offcourse.styles.components.footer
  (:refer-clojure :exclude [first last + - * /])
  (:require [garden
              [arithmetic :refer [* + - /]]
              [units :as u :refer [vh percent]]]
            [offcourse.styles.vocabulary :as v]))

(defn footer [{:keys [templates colors units]}]
  [[v/footer (merge (:highlighted templates)
                    {
                     :background (:night colors)
                     :color (:day colors)
                      })
    [v/footer--container (merge {:padding [[(:four units) 0 (:four units) (* (:atom units) 35)]]})]]
   [v/footer--icon {:width (percent 33)}]])