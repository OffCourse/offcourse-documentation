(ns offcourse.styles.components.viewer
  (:refer-clojure :exclude [rem + - * /])
  (:require [garden.arithmetic :refer [* /]]
            [garden.units :as u :refer [percent px rem]]
            [offcourse.styles.vocabulary :as v]))

(defn viewer [{:keys [templates colors fonts units]}]
  [[v/viewer              (merge  (:column-component   templates)
                                  (:paper              templates)
                                  {:overflow-y         :auto
                                   :flex               1})]
   [v/viewer--content             {:display            :block
                                   :max-width         (:max-content-width   units)}
    [v/viewer-header-1    (merge  (:title              templates)
                                  {:font-size         (* 2.2               (:base-font units))
                                   :line-height       (* 2                 (:base-line-height units)) })]
    [v/viewer-header-2    (merge  (:title              templates)
                                  {:font-size         (* 1.8               (:base-font units))
                                   :line-height       (* 1.8               (:base-line-height units))})]
    [v/viewer-header-3    (merge  (:title              templates))] 
    [v/viewer-header-4    (merge  (:title              templates)
                                  {:font-size         (* 1.25              (:base-font units))
                                   :line-height       (* 1.25              (:base-line-height units))})]
    [v/viewer-header-5    (merge  (:title              templates)
                                  {:font-size         (* 1                 (:base-font units))
                                   :line-height       (* 1                 (:base-line-height units))})]
    [v/viewer-header-6    (merge  (:title              templates)
                                  {:font-size         (* 0.8               (:base-font units))
                                   :line-height       (* 0.8               (:base-line-height units))})]
    [v/viewer-text        (merge  (:text               templates))]
    [v/viewer-image       (merge  {:display            :block
                                   :width             (percent 100)})]
    [v/viewer-figcaption  (merge  (:text               templates)
                                  {:font-size         (* 0.8               (:base-font units))
                                   :line-height       (* 0.8               (:base-line-height units))
                                   :padding           [[(:half units) (:full units)]]
                                   })]
    [v/viewer-blockquote  (merge  (:text               templates)
                                  (:recycled-paper     templates)
                                  {:padding           (:full                units)})]
    [v/viewer-code        (merge  (:mono               templates)
                                  (:recycled-paper     templates)
                                  {:white-space       :pre-wrap
                                   :padding           (:full                units)})]
    [v/viewer-fieldset    (merge  (:text               templates)
                                  {:border             :unset})]
    [v/viewer-legend      (merge  (:text               templates))]
    [v/viewer-input       (merge  (:text               templates)
                                  (:recycled-paper     templates)
                                  {:padding         [[(:half units) (:full units)]] 
                                   :width             (percent 100)})]
    [v/viewer-select      (merge  (:text               templates)
                                  (:recycled-paper     templates)
                                  {:padding         [[(:half units) (:full units)]] 
                                   :border             :unset
                                   :appearance         :none
                                   :border-radius      0
                                   :width             (percent 100)})]
    [v/viewer-textarea    (merge  (:text               templates)
                                  (:recycled-paper     templates)
                                  {:padding         [[(:half units) (:full units)]] 
                                   :border             :unset
                                   :width             (percent 100)})]]])




