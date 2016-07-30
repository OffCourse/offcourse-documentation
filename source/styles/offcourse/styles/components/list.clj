(ns offcourse.styles.components.list
  (:refer-clojure :exclude [first last list])
  (:require [offcourse.styles.vocabulary :as v]))

(defn list-component [{:keys [templates colors fonts units]}]
  [[v/list              (merge (:column-component     templates)
                               {:padding               [[(:half units) 0 0 0]]})]
   [v/list--item        (merge (:row-component        templates)
                               (:recycled-paper       templates)
                               (:list                 templates)
                               {:align-items          :center
                                :padding           [[ 0 (:half units)]]
                                :margin-bottom       (:sixth units)})
    [v/hovered                 (:selected             templates)]
    [v/selected                (:highlighted          templates)]]])