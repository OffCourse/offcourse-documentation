;;;; Naming Schema ;;;;
;
; General wisdom:
; 1. Less code is usually better code: only create an abstraction if it removes code.
; 2. Name things in a meaningful manner so that comments would state the obvious.
;
; Modular rules:
; 1. Use flat specificity as much as possible (single class selectors) and limit cascade usage to component.
; 2. Use layout and grid styles to do all major positioning: Components are always full width.
; 3. Use Clojure templates and units to decouple markup and design pattern.
; 4. Use helpers to prevent the excessive creation of container classes, but generally avoid them.
;
; Naming rules:
; 1. The single dash is used to seperate words
; 2. The double dash is used to distinguish component elements
; 3. The data attributes are used to distinguish component variations and state
; 
;;;;;;;;;;;;;;;;;;;;;;;


(ns offcourse.styles.vocabulary
  (:refer-clojure :exclude [first second last list])
  (:require [garden.selectors :as s]))

; Layout
(s/defclass layout)
(s/defclass layout--section)

(s/defclass grid)
(s/defclass grid--section)

(s/defclass subgrid)
(def subgrid-two          (subgrid (s/attr :data-subgrid-columns := "2")))
(def subgrid-three        (subgrid (s/attr :data-subgrid-columns := "3")))

(s/defclass container)
(def container-column     (container (s/attr :data-container-type := :column)))
(def container-fw         (container (s/attr :data-container-type := :fw)))
(def container-wrap       (container (s/attr :data-container-type := :wrap)))
(def container-subgrid    (container (s/attr :data-container-type := :subgrid))) ; Needed due to broken column break

; Helpers
(s/defclass padding-b-third)
(s/defclass padding-t-twothird)
(s/defclass padding-b-twothird)
(s/defclass padding-t-one)
(s/defclass padding-b-one)
(s/defclass padding-tb-one)
(s/defclass padding-t-two)
(s/defclass padding-b-two)
(s/defclass padding-tb-two)
(s/defclass padding-tb-four)

; Typography
(s/defclass title)
(s/defclass subtitle)
(s/defclass text)
(s/defclass content) ; Class with child selectors for markup that isn't classed 

; Components
(s/defclass header)

(s/defclass logo)
(def logo-large           (logo (s/attr :data-logo-size := :large)))
(def logo-inverse         (logo (s/attr :data-logo-inverse := :true)))
(def logo-padded          (logo (s/attr :data-logo-padded := :true)))

(s/defclass form--input)
(s/defclass form--subscribe)
(s/defclass form--success)
(s/defclass form--error)
(def and--form--error (s/& (form--error))) ; Flat specificity requires non-trivial changes in mailchimp form

(s/defclass image)
(def image-filter         (image (s/attr :data-image-filter := :true)))
(def image-filter-recolor (image (s/attr :data-image-filter-recolor := :true)))

(s/defclass sheet)
(def sheet-sticky       (sheet (s/attr :data-sheet-sticky := :true)))

(s/defclass business-card)
(s/defclass business-card--section)

(s/defclass footer)

(s/defclass button)
(def button-sheet          (button (s/attr :data-button-type := :sheet)))

(s/defclass list)
(s/defclass list--item)

(s/defclass label)

;; MODIFIERS
(s/defpseudoclass hover)
(s/defpseudoclass disabled)
(s/defpseudoclass first-child)
(s/defpseudoclass last-child)

(def selected (s/& (s/attr :data-selected := :true)))
(def disabled (s/& disabled))
(def hovered (s/& hover))
(def first (s/& first-child))
(def second (s/& (s/nth-child 2)))
(def third (s/& (s/nth-child 3)))
(def last (s/& last-child))
