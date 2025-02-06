/**
 * VIEWグリッド定義
 */

let Vb8HenkanGridColumns = [];

$(function() {
    Vb8HenkanGridColumns = [
        Column.cell('henkan_moto_id', Messages['Vb8HenkanGrid.henkanMotoId'], 80, '', null),
        Column.cell('henkan_moto_info', Messages['Vb8HenkanGrid.henkanMotoInfo'], 300, '', null),
        Column.cell('hikitsuida_info', Messages['Vb8HenkanGrid.hikitsuidaInfo'], 300, '', null),
    ];
});
