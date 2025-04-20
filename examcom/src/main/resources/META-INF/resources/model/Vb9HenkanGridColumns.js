/**
 * VIEWグリッド定義
 */

let Vb9HenkanGridColumns = [];

$(function() {
    Vb9HenkanGridColumns = [
        Column.text('henkan_moto_id', Messages['Vb9HenkanGrid.henkanMotoId'], 90, '', null),
        Column.text('henkan_moto_info', Messages['Vb9HenkanGrid.henkanMotoInfo'], 300, '', null),
        Column.text('hikitsuida_info', Messages['Vb9HenkanGrid.hikitsuidaInfo'], 300, '', null),
    ];
});
