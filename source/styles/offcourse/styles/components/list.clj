(ns offcourse.styles.components.list
  (:refer-clojure :exclude [first last list])
  (:require [offcourse.styles.vocabulary :as v]))

(defn list-component [{:keys [templates colors fonts units]}]
  [[v/list              (merge (:column-component     templates))]
   [v/list--item        (merge (:row-component        templates)
                               (:recycled-paper       templates)
                               (:title                templates)
                               {:align-items          :center
                                :height              (:one-and-half units)})
                                :padding             (:half units)
                                :margin-bottom       (:sixth units)
                                :font-size           (:subtitle-font units)
    [v/hovered                 (:selected             templates)]
    [v/selected                (:highlighted          templates)]]])