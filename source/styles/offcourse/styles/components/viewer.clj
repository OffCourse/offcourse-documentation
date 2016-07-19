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
    [v/viewer-header-1    (merge  (:title             templates))]
    [v/viewer-header-2    (merge  (:subtitle             templates))]
    [v/viewer-header-3    (merge  (:subtitle             templates))]
    [v/viewer-header-4    (merge  (:subtitle             templates))]
    [v/viewer-header-5    (merge  (:text             templates))]
    [v/viewer-header-6    (merge  (:text             templates))]
    [v/viewer-text        (merge  (:text             templates))]
    [v/viewer-caption     (merge  (:text             templates))]
    [v/viewer-blockquote  (merge  (:text             templates))]
    [v/viewer-code        (merge  (:text             templates))]
    [v/viewer-fieldset    (merge  (:text             templates))]
    [v/viewer-legend      (merge  (:text             templates))]
    [v/viewer-input       (merge  (:text             templates))]
    [v/viewer-select      (merge  (:text             templates))]
    [v/viewer-textarea    (merge  (:text               templates))]]])



(def viewer-header-1      :h1)
(def viewer-header-2      :h2)
(def viewer-header-3      :h3)
(def viewer-header-4      :h4)
(def viewer-header-5      :h5)
(def viewer-header-6      :h6)
(def viewer-text          :p)
(def viewer-caption       :caption)
(def viewer-blockquote    :blockquote)
(def viewer-code          :code)
(def viewer-fieldset      :fieldset)
(def viewer-legend        :legend)
(def viewer-input         :input)
(def viewer-textarea      :textarea)
(def viewer-select        :select)