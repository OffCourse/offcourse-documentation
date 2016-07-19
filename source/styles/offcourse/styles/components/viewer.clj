(ns offcourse.styles.components.viewer
  (:refer-clojure :exclude [rem + - * /])
  (:require [garden.arithmetic :refer [* /]]
            [garden.units :as u :refer [percent px rem]]
            [offcourse.styles.vocabulary :as v]))

(defn viewer [{:keys [templates colors fonts units]}]
  [[v/viewer              (merge  (:column-component    templates)
                                  (:paper               templates)
                                  {:overflow-y         :auto
                                   :flex                1})]
   [v/viewer--content             {:display            :block
                                   :max-width         (:max-content-width   units)
                                   :padding           (:full                units)}
    [v/viewer-header-1    (merge  (:title            templates)
                                  {:font-size       (* 0.8 (:title-font units))})]
    [v/viewer-header-2    (merge  (:subtitle         templates)
                                  {:font-size       (* 0.7 (:title-font units))})]
    [v/viewer-header-3    (merge  (:subtitle         templates))] 
    [v/viewer-header-4    (merge  (:subtitle         templates)
                                  {:font-size       (* 0.8 (:subtitle-font units))})]
    [v/viewer-header-5    (merge  (:text             templates))]
    [v/viewer-header-6    (merge  (:text             templates)
                                  {:font-size       (* 0.8 (:base-font units))})]
    [v/viewer-text        (merge  (:text             templates))]
    [v/viewer-caption     (merge  (:text             templates))]
    [v/viewer-blockquote  (merge  (:text             templates))]
    [v/viewer-code        (merge  (:text             templates))]
    [v/viewer-fieldset    (merge  (:text             templates))]
    [v/viewer-legend      (merge  (:text             templates))]
    [v/viewer-input       (merge  (:text             templates))]
    [v/viewer-select      (merge  (:text             templates))]
    [v/viewer-textarea    (merge  (:text               templates))]]])

; title viewer is title-medium