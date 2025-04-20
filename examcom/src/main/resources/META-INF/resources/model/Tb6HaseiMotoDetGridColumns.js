/**
 * 派生元明細グリッド定義
 */

let Tb6HaseiMotoDetGridColumns = [];

$(function() {
    Tb6HaseiMotoDetGridColumns = [
        Column.text('HASEI_MOTO_ID', Messages['Tb6HaseiMotoDetGrid.haseiMotoId'], 90, 'primaryKey numbering', null),
        Column.text('HASEI_MOTO_BN', Messages['Tb6HaseiMotoDetGrid.haseiMotoBn'], 90, 'primaryKey numbering', null),
        Column.text('HASEI_MOTO_DET_INFO', Messages['Tb6HaseiMotoDetGrid.haseiMotoDetInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6HaseiMotoDetGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
