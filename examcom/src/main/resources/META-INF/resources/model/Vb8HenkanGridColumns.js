/**
 * VIEWグリッド定義
 */

let Vb8HenkanGridColumns = [];

$(function() {
    Vb8HenkanGridColumns = [
        Column.comma('henkan_moto_id', Messages['Vb8HenkanGrid.henkanMotoId'], 80, '', null),
        Column.text('henkan_moto_info', Messages['Vb8HenkanGrid.henkanMotoInfo'], 300, '', null),
        Column.text('hikitsuida_info', Messages['Vb8HenkanGrid.hikitsuidaInfo'], 300, '', null),
    ];
});
