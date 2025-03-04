/**
 * 制約マスタグリッド定義
 */

let Mb8SeiyakuGridColumns = [];

$(function() {
    Mb8SeiyakuGridColumns = [
        Column.text('SEIYAKU_ID', Messages['Mb8SeiyakuGrid.seiyakuId'], 80, 'primaryKey numbering', null),
        Column.text('SEIYAKU_MEI', Messages['Mb8SeiyakuGrid.seiyakuMei'], 300, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Mb8SeiyakuGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
