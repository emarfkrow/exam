/**
 * 派生先２明細グリッド定義
 */

let Tb6HaseiSaki2DetGridColumns = [];

$(function() {
    Tb6HaseiSaki2DetGridColumns = [
        Column.text('HASEI_TO2_ID', Messages['Tb6HaseiSaki2DetGrid.haseiTo2Id'], 90, 'primaryKey numbering', null),
        Column.text('HASEI_TO2_BN', Messages['Tb6HaseiSaki2DetGrid.haseiTo2Bn'], 90, 'primaryKey numbering', null),
        Column.text('HASEI_DET_INFO', Messages['Tb6HaseiSaki2DetGrid.haseiDetInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6HaseiSaki2DetGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
